package Platform;

import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added : " + campaign.getName() + "  Discount rate is : "+ campaign.getDiscountRate());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted : " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated : " + campaign.getName());
		
	}

}
